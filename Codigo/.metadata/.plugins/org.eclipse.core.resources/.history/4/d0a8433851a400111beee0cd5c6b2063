package com.uc3m.wyt;

import com.openfeint.api.OpenFeint;
import com.openfeint.api.resource.Achievement;
import com.openfeint.api.resource.Leaderboard;
import com.openfeint.api.resource.Score;

public class OperarOpenFeint {

	protected static final long PUNTOS_MEJOR_COMPANYERO = 50;
	protected static final long PUNTOS_MAS_CREATIVO = 15;
	protected static final long PUNTOS_MAS_CONSTANTE = 125;
	protected static final long PUNTOS_MAS_SABIO = 140;
	protected static final long PUNTOS_MAS_TRABAJADOR = 110;
	protected static Leaderboard l = null;
	protected static long puntos_nuevos = 0;
	protected static Achievement a = null;
	protected static boolean achievements = false;

	protected static void anyadir_puntuacion(long puntos, String id_leaderboard, String id_achievements, long limite, boolean achievement) {
		l = new Leaderboard(id_leaderboard);
		if(achievements)
			a = new Achievement(id_achievements);
		puntos_nuevos = puntos;
		achievements = achievement;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (achievements && newHighScore) {
								l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
									@Override
									public void onSuccess(Score score) {
										if (score != null) {
											if ((!a.isUnlocked) && (score.score >= PUNTOS_MEJOR_COMPANYERO)) {
												a.unlock(new Achievement.UnlockCB() {
													@Override
													public void onSuccess(boolean newUnlock) {
													}
												});
											}
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}
	
	protected static void anyadir_puntuacion_mejor_companyero(long puntos) {
		l = new Leaderboard("1174957");
		puntos_nuevos = puntos;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
									@Override
									public void onSuccess(Score score) {
										if (score != null) {
											Achievement a = new Achievement("1678262");
											if ((!a.isUnlocked) && (score.score >= PUNTOS_MEJOR_COMPANYERO)) {
												a.unlock(new Achievement.UnlockCB() {
													@Override
													public void onSuccess(boolean newUnlock) {
													}
												});
											}
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_creativo(long puntos) {
		l = new Leaderboard("1174967");
		puntos_nuevos = puntos;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
									@Override
									public void onSuccess(Score score) {
										if (score != null) {
											Achievement a = new Achievement("1678252");
											if ((!a.isUnlocked) && (score.score >= PUNTOS_MAS_CREATIVO)) {
												a.unlock(new Achievement.UnlockCB() {
													@Override
													public void onSuccess(boolean newUnlock) {
													}
												});
											}
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_sabio(long puntos) {
		l = new Leaderboard("1174947");
		puntos_nuevos = puntos;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
									@Override
									public void onSuccess(Score score) {
										if (score != null) {
											Achievement a = new Achievement("1678242");
											if ((!a.isUnlocked) && (score.score >= PUNTOS_MAS_SABIO)) {
												a.unlock(new Achievement.UnlockCB() {
													@Override
													public void onSuccess(boolean newUnlock) {
													}
												});
											}
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_constante(long puntos) {
		l = new Leaderboard("1174977");
		puntos_nuevos = puntos;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
									@Override
									public void onSuccess(Score score) {
										if (score != null) {
											Achievement a = new Achievement("1678232");
											if ((!a.isUnlocked) && (score.score >= PUNTOS_MAS_CONSTANTE)) {
												a.unlock(new Achievement.UnlockCB() {
													@Override
													public void onSuccess(boolean newUnlock) {
													}
												});
											}
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_trabajador(long puntos) {
		l = new Leaderboard("1174937");
		puntos_nuevos = puntos;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
									@Override
									public void onSuccess(Score score) {
										if (score != null) {
											Achievement a = new Achievement("1678222");
											if ((!a.isUnlocked) && (score.score >= PUNTOS_MAS_TRABAJADOR)) {
												a.unlock(new Achievement.UnlockCB() {
													@Override
													public void onSuccess(boolean newUnlock) {
													}
												});
											}
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_clasificacion_general(long puntos) {
		l = new Leaderboard("1172917");
		puntos_nuevos = puntos;
		l.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}
}
