import 'package:audioplayers/audio_cache.dart';
import 'package:flutter/material.dart';

void main() => runApp(XylophoneApp());

class XylophoneApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Body(),
    );
  }
}

class Body extends StatelessWidget {
  Widget soundBar(int ind) {
    return Container(
      decoration: BoxDecoration(
        color: Colors.deepPurple[(ind + 1) * 100],
      ),
      height: 121,
      child: FlatButton(
        onHighlightChanged: (value) {
          print(value.toString());
        },
        onPressed: () {
          int index = ind + 1;
          final _audioCache = AudioCache();
          _audioCache.play('note$index.wav');
        },
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final size = MediaQuery.of(context).size;
    return Scaffold(
      body: SafeArea(
        child: ListView.builder(
          // shrinkWrap: true,
          itemCount: 7,
          itemBuilder: (context, index) {
            return soundBar(index);
          },
        ),
      ),
    );
  }
}
