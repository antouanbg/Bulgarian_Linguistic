Grapheme-to-phoneme models
_____________
downloaded from Montreal Forced Aligner - http://mlmlab.org/mfa/mfa-models/g2p/bulgarian_g2p.zip is rule-based (weighted finite-state transducers (FSTs) type model - http://www.openfst.org/twiki/bin/view/FST/WebHome
Included with MFA is a separate tool to generate a dictionary from a preexisting model. This should be used if you're aligning a dataset for which you have no pronunciation dictionary or the orthography is very transparent. We have pretrained models for several languages, which can be downloaded here. These models were generated using Phonetisaurus and the GlobalPhone dataset. This means that they will only work for transcriptions which use the same alphabet.
More info with all L: https://github.com/MontrealCorpusTools/Montreal-Forced-Aligner/blob/master/docs/source/pretrained_models.rst

______
G2P refers to grapheme-to-phoneme conversion.  This is the process of using rules to generate a pronunciation for a word (for creating a pronunciation dictionary).  The rules are usually created by a automated statistical analysis of a pronunciation dictionary. The G2P algorithm is used to generate the most probable phone list for a word not contained in the pronunciation dictionary (i.e. out-of-vocabulary words) used to create the G2P rules - http://www.voxforge.org/home/docs/faq/faq/what-is-g2p

Utilities like: https://github.com/AdolfVonKleist/Phonetisaurus
Software tools for creating your own pronunciation dictionary (from the CMU Sphinx site):
Phonetisaurus
sequitur-g2p
Text-to-Speech packages
FreeTTS
OpenMary Java TT
espeak
CMU online web service: lmtool
