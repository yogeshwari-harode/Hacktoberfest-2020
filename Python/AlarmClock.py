import winsound
import datetime
from tkinter import*
def alarm():
    h = entry2.get()
    m = entry3.get()
    while True:
        if (int(h) == datetime.datetime.now().hour and int(m)==datetime.datetime.now().minute):
            winsound.PlaySound("Alarm Clock Beep.wav", winsound.SND_ASYNC)  # Alarm Clock Beep.wav is name of Alarm Clock Beep file.
            break



window=Tk()   # for new GUI window using tkinter
window.geometry("400x100")
window.title("Alarm Clock")
window.configure(background="yellow")
label2=Label(window,text="Enter hours(24 hr format)  ",width=25,bg="yellow",font=("arial",12,"bold"))
label2.place(x=120,y=0)
entry2=Entry(window)
entry2.grid(row=1,column=2)

label3=Label(window,text="Enter minutes   ",width=25,bg="yellow",font=("arial",12,"bold"))
label3.place(x=120,y=20)
entry3=Entry(window)
entry3.grid(row=2,column=2)

button1=Button(window,text="Set Alarm")
button1.grid(row=3,column=2)
button1.config(command=alarm)




window.mainloop()
