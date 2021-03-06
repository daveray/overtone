(ns overtone.core
  (:use [overtone.util ns])
  (:require clojure.stacktrace
            [overtone.util lib]
            [overtone.config store]
            [overtone.midi]
            [overtone.osc]
            [overtone.algo chance scaling trig]
            [overtone.sc buffer bus envelope example gens info
                         mixer node sample server synth trigger]
            [overtone.music rhythm pitch tuning time]
            [overtone.studio mixer util fx wavetable]
            [overtone.repl ugens examples shell]
            [overtone.libs asset event freesound]
            [overtone.version]
            [overtone.viz scope]
            [overtone.gui control]))

(immigrate
 'overtone.util.lib
 'overtone.osc
 'overtone.midi
 'overtone.algo.chance
 'overtone.algo.scaling
 'overtone.algo.trig
 'overtone.config.store
 'overtone.sc.buffer
 'overtone.sc.bus
 'overtone.sc.envelope
 'overtone.sc.example
 'overtone.sc.gens
 'overtone.sc.info
 'overtone.sc.mixer
 'overtone.sc.node
 'overtone.sc.sample
 'overtone.sc.server
 'overtone.sc.synth
 'overtone.sc.trigger
 'overtone.music.rhythm
 'overtone.music.pitch
 'overtone.music.tuning
 'overtone.music.time
 'overtone.studio.mixer
 'overtone.studio.fx
 'overtone.studio.wavetable
 'overtone.repl.ugens
 'overtone.repl.examples
 'overtone.repl.shell
 'overtone.libs.asset
 'overtone.libs.event
 'overtone.libs.freesound
 'overtone.version
 'overtone.viz.scope
 )
