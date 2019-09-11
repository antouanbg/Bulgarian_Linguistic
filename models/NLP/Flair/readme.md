Bulgarian Language Model for Zalando's flair library.
Thanks to [Stefan Schweter](https://github.com/stefan-it) repository as a part of his NLP research with [flair] (https://github.com/zalandoresearch/flair), a very simple framework for state-of-the-art Natural Language Processing (NLP) framework from Zalando Research.

This repository will include various language models (forward and backward) that can be used with flair. It will be updated frequently. 
trained a Bulgarian language model with texts from Wikipedia, Europarl and SETimes. It is a relatively small corpus with 66 million tokens and was trained for ~ 3 days.

That Bulgarian model for pos tagging on universal dependencies (version 1.2) has  accuracy was ~ 98 % with fasttext embeddings only. In combination with the forward and backward language model the final accuracy is 99.08 % on the test set. Here are some comparisons with other papers (UD 1.2, Bulgarian):
*System	Final Accuracy
*Yu et. al (2017)	98.20
*Plank et. al (2016)	98.23
*Yasunaga et. al (2017)	98.53
*flair	99.08
_________

[AWS S3 datastorage backup link](https://s3.eu-central-1.amazonaws.com/daneda.com/models/NLP/lm-bg-small-forward_backward-v0.1.pt.zip) 
