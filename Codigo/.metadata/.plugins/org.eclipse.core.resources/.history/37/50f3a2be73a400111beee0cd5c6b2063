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
	protected static Leaderboard l_gen = null;
	protected static Leaderboard l_tra = null;
	protected static Leaderboard l_sabio = null;
	protected static Leaderboard l_com = null;
	protected static Leaderboard l_crea = null;
	protected static Leaderboard l_const = null;
	protected static long puntos_nuevos = 0;
	protected static boolean achievements = false;
	
	protected static void anyadir_puntuacion_mejor_companyero(long puntos) {
		l_com = new Leaderboard("1174957");
		puntos_nuevos = puntos;
		l_com.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l_com, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l_com.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
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
				}  else {
					//Es la primera vez, ya que el usuario no ha subido todav’a ninguna puntuaci—n
					Score s = new Score(puntos_nuevos, null);
					s.submitTo(l_com, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_creativo(long puntos) {
		l_crea = new Leaderboard("1174967");
		puntos_nuevos = puntos;
		l_crea.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l_crea, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l_crea.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
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
				} else {
					//Es la primera vez, ya que el usuario no ha subido todav’a ninguna puntuaci—n
					Score s = new Score(puntos_nuevos, null);
					s.submitTo(l_crea, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_sabio(long puntos) {
		l_sabio = new Leaderboard("1175547");
		puntos_nuevos = puntos;
		l_sabio.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l_sabio, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l_sabio.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
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
				} else {
					//Es la primera vez, ya que el usuario no ha subido todav’a ninguna puntuaci—n
					Score s = new Score(puntos_nuevos, null);
					s.submitTo(l_sabio, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_constante(long puntos) {
		l_const = new Leaderboard("1174977");
		puntos_nuevos = puntos;
		l_const.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l_const, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l_const.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
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
				} else {
					//Es la primera vez, ya que el usuario no ha subido todav’a ninguna puntuaci—n
					Score s = new Score(puntos_nuevos, null);
					s.submitTo(l_const, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_mas_trabajador(long puntos) {
		l_tra = new Leaderboard("1175537");
		puntos_nuevos = puntos;
		l_tra.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l_tra, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
							if (newHighScore) {
								l_tra.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
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
				}  else {
					//Es la primera vez, ya que el usuario no ha subido todav’a ninguna puntuaci—n
					Score s = new Score(puntos_nuevos, null);
					s.submitTo(l_tra, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}

	protected static void anyadir_puntuacion_clasificacion_general(long puntos) {
		l_gen = new Leaderboard("1175527");
		puntos_nuevos = puntos;
		l_gen.getUserScore(OpenFeint.getCurrentUser(), new Leaderboard.GetUserScoreCB() {
			@Override
			public void onSuccess(Score score) {
				if (score != null) {
					Score s = new Score(score.score + puntos_nuevos, null);
					s.submitTo(l_gen, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				} else {
					//Es la primera vez, ya que el usuario no ha subido todav’a ninguna puntuaci—n
					Score s = new Score(puntos_nuevos, null);
					s.submitTo(l_gen, new Score.SubmitToCB() {
						@Override
						public void onSuccess(boolean newHighScore) {
						}
					});
				}
			}
		});
	}
}
