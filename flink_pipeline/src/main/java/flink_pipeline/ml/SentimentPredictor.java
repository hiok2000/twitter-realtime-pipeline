package flink_pipeline.ml;

public class SentimentPredictor {

    public static double[] score(double[] input) {
        double var0;
        var0 = (1) / ((1) + (Math.exp((0) - (subroutine0(input)))));
        return new double[] {(1) - (var0), var0};
    }
    public static double subroutine0(double[] input) {
        double var0;
        if ((input[1]) >= (0.092426084)) {
            if ((input[40]) >= (-0.185631394)) {
                if ((input[38]) >= (0.00599888898)) {
                    if ((input[7]) >= (0.329768658)) {
                        if ((input[11]) >= (0.59673667)) {
                            var0 = 0.096296303;
                        } else {
                            var0 = -0.0469945334;
                        }
                    } else {
                        if ((input[10]) >= (-0.0479585454)) {
                            var0 = -0.0036809817;
                        } else {
                            var0 = 0.060017813;
                        }
                    }
                } else {
                    if ((input[9]) >= (0.249487832)) {
                        if ((input[1]) >= (0.179598242)) {
                            var0 = 0.13698031;
                        } else {
                            var0 = 0.0630872473;
                        }
                    } else {
                        if ((input[14]) >= (0.529605508)) {
                            var0 = 0.0225165561;
                        } else {
                            var0 = 0.0884696022;
                        }
                    }
                }
            } else {
                if ((input[5]) >= (-0.678949952)) {
                    if ((input[9]) >= (0.131259799)) {
                        if ((input[20]) >= (-0.398799181)) {
                            var0 = 0.0414125212;
                        } else {
                            var0 = -0.0514285751;
                        }
                    } else {
                        if ((input[38]) >= (0.0443821996)) {
                            var0 = -0.0648809597;
                        } else {
                            var0 = 0.000980392215;
                        }
                    }
                } else {
                    if ((input[28]) >= (0.786583483)) {
                        if ((input[0]) >= (0.0463614389)) {
                            var0 = -0.100000001;
                        } else {
                            var0 = 0;
                        }
                    } else {
                        if ((input[28]) >= (-0.253509343)) {
                            var0 = 0.13454546;
                        } else {
                            var0 = -0.0666666701;
                        }
                    }
                }
            }
        } else {
            if ((input[3]) >= (-0.511157751)) {
                if ((input[25]) >= (-0.617306411)) {
                    if ((input[42]) >= (-0.456266344)) {
                        if ((input[36]) >= (0.323555917)) {
                            var0 = -0.0642857179;
                        } else {
                            var0 = 0.0213533845;
                        }
                    } else {
                        if ((input[16]) >= (-0.0949295014)) {
                            var0 = 0.137142867;
                        } else {
                            var0 = 0.0307692327;
                        }
                    }
                } else {
                    if ((input[16]) >= (0.138666496)) {
                        if ((input[28]) >= (0.828458309)) {
                            var0 = -0.0611398928;
                        } else {
                            var0 = 0.00714285765;
                        }
                    } else {
                        if ((input[28]) >= (0.410448432)) {
                            var0 = -0.0741799846;
                        } else {
                            var0 = -0.027218936;
                        }
                    }
                }
            } else {
                if ((input[38]) >= (-0.194592506)) {
                    if ((input[17]) >= (-0.471170008)) {
                        if ((input[43]) >= (0.343314946)) {
                            var0 = -0.140909091;
                        } else {
                            var0 = -0.084644191;
                        }
                    } else {
                        if ((input[16]) >= (-0.102663502)) {
                            var0 = 0.125;
                        } else {
                            var0 = -0.0500000007;
                        }
                    }
                } else {
                    if ((input[11]) >= (0.164835006)) {
                        if ((input[20]) >= (0.143404499)) {
                            var0 = 0;
                        } else {
                            var0 = 0.15384616;
                        }
                    } else {
                        if ((input[11]) >= (-0.13073808)) {
                            var0 = -0.142857149;
                        } else {
                            var0 = 0.0285714306;
                        }
                    }
                }
            }
        }
        double var1;
        if ((input[1]) >= (0.181584165)) {
            if ((input[9]) >= (0.14869678)) {
                if ((input[42]) >= (-0.0855687112)) {
                    if ((input[3]) >= (-0.449420005)) {
                        if ((input[20]) >= (-0.271630883)) {
                            var1 = 0.0756473467;
                        } else {
                            var1 = -0.00221491954;
                        }
                    } else {
                        if ((input[7]) >= (-0.43294999)) {
                            var1 = -0.0788714513;
                        } else {
                            var1 = 0.117295183;
                        }
                    }
                } else {
                    if ((input[7]) >= (0.152804166)) {
                        if ((input[32]) >= (0.0212019999)) {
                            var1 = -0.0262101982;
                        } else {
                            var1 = 0.078243427;
                        }
                    } else {
                        if ((input[44]) >= (-0.318397522)) {
                            var1 = 0.119164646;
                        } else {
                            var1 = -0.0720850378;
                        }
                    }
                }
            } else {
                if ((input[40]) >= (0.0198023133)) {
                    if ((input[36]) >= (-0.00344768073)) {
                        if ((input[2]) >= (0.10565187)) {
                            var1 = 0.00182685594;
                        } else {
                            var1 = 0.0721871629;
                        }
                    } else {
                        if ((input[20]) >= (0.542249441)) {
                            var1 = -0.0386584401;
                        } else {
                            var1 = 0.107950985;
                        }
                    }
                } else {
                    if ((input[38]) >= (0.171996251)) {
                        if ((input[10]) >= (-0.316087842)) {
                            var1 = -0.0756010264;
                        } else {
                            var1 = 0.0281970389;
                        }
                    } else {
                        if ((input[10]) >= (-0.140435547)) {
                            var1 = -0.0144438092;
                        } else {
                            var1 = 0.0364681184;
                        }
                    }
                }
            }
        } else {
            if ((input[3]) >= (-0.502599716)) {
                if ((input[7]) >= (0.0398632661)) {
                    if ((input[42]) >= (-0.283586353)) {
                        if ((input[16]) >= (0.157923907)) {
                            var1 = -0.0170567781;
                        } else {
                            var1 = -0.0627086088;
                        }
                    } else {
                        if ((input[4]) >= (0.679144979)) {
                            var1 = 0.140322432;
                        } else {
                            var1 = 0.00839423947;
                        }
                    }
                } else {
                    if ((input[1]) >= (-0.0556354523)) {
                        if ((input[11]) >= (0.254199982)) {
                            var1 = 0.0680946335;
                        } else {
                            var1 = 0.00749976188;
                        }
                    } else {
                        if ((input[25]) >= (-0.317758799)) {
                            var1 = 0.052776821;
                        } else {
                            var1 = -0.0347990505;
                        }
                    }
                }
            } else {
                if ((input[38]) >= (0.168263853)) {
                    if ((input[43]) >= (0.00750395004)) {
                        if ((input[14]) >= (1.06412601)) {
                            var1 = 0.00989272632;
                        } else {
                            var1 = -0.133338675;
                        }
                    } else {
                        if ((input[49]) >= (0.0821270049)) {
                            var1 = 0.077987276;
                        } else {
                            var1 = -0.0846739262;
                        }
                    }
                } else {
                    if ((input[29]) >= (-0.532009721)) {
                        if ((input[38]) >= (-0.194592506)) {
                            var1 = -0.0879115164;
                        } else {
                            var1 = 0.0169581957;
                        }
                    } else {
                        if ((input[28]) >= (0.845204175)) {
                            var1 = -0.0957911983;
                        } else {
                            var1 = 0.072548382;
                        }
                    }
                }
            }
        }
        double var2;
        if ((input[1]) >= (0.092387341)) {
            if ((input[40]) >= (-0.152325004)) {
                if ((input[38]) >= (0.00599888898)) {
                    if ((input[7]) >= (-0.094640471)) {
                        if ((input[16]) >= (-0.095172748)) {
                            var2 = 0.0358827189;
                        } else {
                            var2 = -0.0383891501;
                        }
                    } else {
                        if ((input[10]) >= (-0.0475051403)) {
                            var2 = 0.0205802694;
                        } else {
                            var2 = 0.0852484629;
                        }
                    }
                } else {
                    if ((input[14]) >= (0.523624897)) {
                        if ((input[49]) >= (0.140981391)) {
                            var2 = 0.069621779;
                        } else {
                            var2 = -0.00361682335;
                        }
                    } else {
                        if ((input[15]) >= (0.325337857)) {
                            var2 = 0.00462544803;
                        } else {
                            var2 = 0.106044009;
                        }
                    }
                }
            } else {
                if ((input[38]) >= (0.0610624589)) {
                    if ((input[42]) >= (-0.272923231)) {
                        if ((input[29]) >= (-0.179889172)) {
                            var2 = -0.0782758445;
                        } else {
                            var2 = -0.0235964041;
                        }
                    } else {
                        if ((input[35]) >= (-0.0688646734)) {
                            var2 = -0.0105666947;
                        } else {
                            var2 = 0.106854908;
                        }
                    }
                } else {
                    if ((input[5]) >= (-0.420304477)) {
                        if ((input[9]) >= (-0.0478575006)) {
                            var2 = 0.0336649083;
                        } else {
                            var2 = -0.0424132086;
                        }
                    } else {
                        if ((input[0]) >= (0.171878129)) {
                            var2 = 0.026834026;
                        } else {
                            var2 = 0.127252609;
                        }
                    }
                }
            }
        } else {
            if ((input[40]) >= (-0.0770461261)) {
                if ((input[49]) >= (0.285189122)) {
                    if ((input[14]) >= (0.187264591)) {
                        if ((input[37]) >= (0.256354928)) {
                            var2 = 0.0829403028;
                        } else {
                            var2 = 0.000594903191;
                        }
                    } else {
                        if ((input[43]) >= (0.199904621)) {
                            var2 = 0.0172458421;
                        } else {
                            var2 = 0.120279744;
                        }
                    }
                } else {
                    if ((input[15]) >= (0.117113754)) {
                        if ((input[37]) >= (0.437452495)) {
                            var2 = 0.0667310283;
                        } else {
                            var2 = -0.0509930663;
                        }
                    } else {
                        if ((input[42]) >= (-0.458181739)) {
                            var2 = -0.00649278006;
                        } else {
                            var2 = 0.0832600147;
                        }
                    }
                }
            } else {
                if ((input[38]) >= (0.230564997)) {
                    if ((input[32]) >= (-0.0648870021)) {
                        if ((input[43]) >= (-0.249068111)) {
                            var2 = -0.127222583;
                        } else {
                            var2 = 0.0418539755;
                        }
                    } else {
                        if ((input[39]) >= (-0.322432697)) {
                            var2 = -0.080876641;
                        } else {
                            var2 = -0.00270584435;
                        }
                    }
                } else {
                    if ((input[11]) >= (0.160592169)) {
                        if ((input[14]) >= (0.382784188)) {
                            var2 = -0.017010102;
                        } else {
                            var2 = 0.0556380637;
                        }
                    } else {
                        if ((input[42]) >= (-0.0513717495)) {
                            var2 = -0.0694253966;
                        } else {
                            var2 = -0.0152987484;
                        }
                    }
                }
            }
        }
        double var3;
        if ((input[1]) >= (0.0236298516)) {
            if ((input[40]) >= (-0.170268714)) {
                if ((input[1]) >= (0.412046492)) {
                    if ((input[43]) >= (-0.0316308737)) {
                        if ((input[7]) >= (0.450140715)) {
                            var3 = -0.100574471;
                        } else {
                            var3 = 0.0746656656;
                        }
                    } else {
                        if ((input[4]) >= (-0.0499868318)) {
                            var3 = 0.12408793;
                        } else {
                            var3 = 0.0214752983;
                        }
                    }
                } else {
                    if ((input[40]) >= (0.190122455)) {
                        if ((input[44]) >= (-0.152841672)) {
                            var3 = 0.0734854043;
                        } else {
                            var3 = -0.0364536308;
                        }
                    } else {
                        if ((input[9]) >= (0.17640245)) {
                            var3 = 0.0434699059;
                        } else {
                            var3 = -0.00161119737;
                        }
                    }
                }
            } else {
                if ((input[35]) >= (-0.11035528)) {
                    if ((input[3]) >= (-0.338693053)) {
                        if ((input[10]) >= (-0.316978514)) {
                            var3 = -0.0270065367;
                        } else {
                            var3 = 0.0476043783;
                        }
                    } else {
                        if ((input[11]) >= (0.239524439)) {
                            var3 = 4.26548468e-05;
                        } else {
                            var3 = -0.0823267624;
                        }
                    }
                } else {
                    if ((input[42]) >= (-0.32277292)) {
                        if ((input[19]) >= (-0.484420002)) {
                            var3 = -0.00858930871;
                        } else {
                            var3 = 0.0564374514;
                        }
                    } else {
                        if ((input[43]) >= (-0.0547574982)) {
                            var3 = 0.0649564862;
                        } else {
                            var3 = 0.155745313;
                        }
                    }
                }
            }
        } else {
            if ((input[3]) >= (-0.514715016)) {
                if ((input[25]) >= (-0.345332146)) {
                    if ((input[17]) >= (0.152265131)) {
                        if ((input[41]) >= (-0.811692238)) {
                            var3 = 0.0921326354;
                        } else {
                            var3 = -0.1217402;
                        }
                    } else {
                        if ((input[17]) >= (0.0545150004)) {
                            var3 = -0.0846479908;
                        } else {
                            var3 = 0.022503227;
                        }
                    }
                } else {
                    if ((input[16]) >= (0.0969606638)) {
                        if ((input[28]) >= (0.576227725)) {
                            var3 = -0.0252705868;
                        } else {
                            var3 = 0.0190719534;
                        }
                    } else {
                        if ((input[7]) >= (-0.408065379)) {
                            var3 = -0.0548432581;
                        } else {
                            var3 = 0.0292828735;
                        }
                    }
                }
            } else {
                if ((input[17]) >= (-0.471170008)) {
                    if ((input[38]) >= (-0.194592506)) {
                        if ((input[43]) >= (0.170805007)) {
                            var3 = -0.114818029;
                        } else {
                            var3 = -0.0475818329;
                        }
                    } else {
                        if ((input[15]) >= (0.342209458)) {
                            var3 = 0.11344973;
                        } else {
                            var3 = -0.0369971804;
                        }
                    }
                } else {
                    if ((input[19]) >= (-0.294090003)) {
                        var3 = -0.0519674793;
                    } else {
                        var3 = 0.123312429;
                    }
                }
            }
        }
        double var4;
        if ((input[1]) >= (0.181584165)) {
            if ((input[9]) >= (0.0575467497)) {
                if ((input[38]) >= (0.0395572707)) {
                    if ((input[7]) >= (0.35725832)) {
                        if ((input[34]) >= (-0.034323249)) {
                            var4 = 0.0250580795;
                        } else {
                            var4 = -0.106233768;
                        }
                    } else {
                        if ((input[6]) >= (0.056990806)) {
                            var4 = -0.0538632981;
                        } else {
                            var4 = 0.0526662357;
                        }
                    }
                } else {
                    if ((input[15]) >= (0.527698755)) {
                        if ((input[1]) >= (0.49372834)) {
                            var4 = 0.130011871;
                        } else {
                            var4 = -0.104626;
                        }
                    } else {
                        if ((input[42]) >= (-0.320463657)) {
                            var4 = 0.0664247796;
                        } else {
                            var4 = 0.111928642;
                        }
                    }
                }
            } else {
                if ((input[40]) >= (0.0529728681)) {
                    if ((input[44]) >= (-0.1504125)) {
                        if ((input[16]) >= (0.0359076932)) {
                            var4 = 0.119243287;
                        } else {
                            var4 = 0.0416569375;
                        }
                    } else {
                        if ((input[23]) >= (0.321240276)) {
                            var4 = -0.127154365;
                        } else {
                            var4 = 0.0282917805;
                        }
                    }
                } else {
                    if ((input[20]) >= (-0.0247123074)) {
                        if ((input[42]) >= (-0.0209034439)) {
                            var4 = -0.0345579796;
                        } else {
                            var4 = 0.0329065807;
                        }
                    } else {
                        if ((input[16]) >= (0.152592301)) {
                            var4 = -0.000922942942;
                        } else {
                            var4 = -0.0811633244;
                        }
                    }
                }
            }
        } else {
            if ((input[3]) >= (-0.604717612)) {
                if ((input[11]) >= (0.15609917)) {
                    if ((input[14]) >= (0.385031164)) {
                        if ((input[6]) >= (-0.515157819)) {
                            var4 = -0.0248588119;
                        } else {
                            var4 = 0.0334598497;
                        }
                    } else {
                        if ((input[49]) >= (0.455829501)) {
                            var4 = 0.0801339373;
                        } else {
                            var4 = 0.021058239;
                        }
                    }
                } else {
                    if ((input[42]) >= (-0.307970256)) {
                        if ((input[38]) >= (0.180989325)) {
                            var4 = -0.0685922652;
                        } else {
                            var4 = -0.0231492352;
                        }
                    } else {
                        if ((input[28]) >= (0.608424008)) {
                            var4 = -0.0461846702;
                        } else {
                            var4 = 0.0362339914;
                        }
                    }
                }
            } else {
                if ((input[44]) >= (-0.124024287)) {
                    if ((input[32]) >= (-0.744169176)) {
                        if ((input[2]) >= (0.457743347)) {
                            var4 = -0.00266622705;
                        } else {
                            var4 = -0.116608955;
                        }
                    } else {
                        if ((input[48]) >= (-0.123897247)) {
                            var4 = 0.133757278;
                        } else {
                            var4 = -0.0380615406;
                        }
                    }
                } else {
                    if ((input[41]) >= (-0.231960237)) {
                        if ((input[0]) >= (0.223360509)) {
                            var4 = -0.0466630682;
                        } else {
                            var4 = 0.116984569;
                        }
                    } else {
                        if ((input[16]) >= (0.294732511)) {
                            var4 = 0.0284756329;
                        } else {
                            var4 = -0.137354434;
                        }
                    }
                }
            }
        }
        return (((((-0.0) + (var0)) + (var1)) + (var2)) + (var3)) + (var4);
    }
}
