.class public final Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;
.super Lbm0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public h0:Lf20;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbm0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lbm0;->a0:Lgm0;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-virtual {p0}, Liw;->G()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    iput-boolean v2, v0, Lgm0;->e:Z

    .line 11
    .line 12
    new-instance v3, Lfm0;

    .line 13
    .line 14
    invoke-direct {v3, v1, v0}, Lfm0;-><init>(Landroid/content/Context;Lgm0;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const v4, 0x7f150006

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :try_start_0
    invoke-virtual {v3, v1}, Lfm0;->c(Landroid/content/res/XmlResourceParser;)Landroidx/preference/PreferenceGroup;

    .line 29
    .line 30
    .line 31
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 33
    .line 34
    .line 35
    check-cast v3, Landroidx/preference/PreferenceScreen;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Landroidx/preference/Preference;->k(Lgm0;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lgm0;->d:Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 45
    .line 46
    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    iput-boolean v1, v0, Lgm0;->e:Z

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3, p1}, Landroidx/preference/PreferenceGroup;->y(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    instance-of v0, v3, Landroidx/preference/PreferenceScreen;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v1, "Preference object with key "

    .line 64
    .line 65
    const-string v2, " is not a PreferenceScreen"

    .line 66
    .line 67
    invoke-static {v1, p1, v2}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    :goto_0
    check-cast v3, Landroidx/preference/PreferenceScreen;

    .line 76
    .line 77
    iget-object p1, p0, Lbm0;->a0:Lgm0;

    .line 78
    .line 79
    iget-object v0, p1, Lgm0;->g:Landroidx/preference/PreferenceScreen;

    .line 80
    .line 81
    if-eq v3, v0, :cond_5

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->n()V

    .line 86
    .line 87
    .line 88
    :cond_3
    iput-object v3, p1, Lgm0;->g:Landroidx/preference/PreferenceScreen;

    .line 89
    .line 90
    iput-boolean v2, p0, Lbm0;->c0:Z

    .line 91
    .line 92
    iget-boolean p1, p0, Lbm0;->d0:Z

    .line 93
    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    iget-object p1, p0, Lbm0;->f0:Lq3;

    .line 97
    .line 98
    invoke-virtual {p1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_1
    const-string p1, "key_theme"

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Landroidx/preference/ListPreference;

    .line 119
    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    new-instance v0, Lyo;

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    invoke-direct {v0, v1}, Lyo;-><init>(I)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p1, Landroidx/preference/Preference;->j:Lyo;

    .line 129
    .line 130
    :cond_6
    const-string p1, "key_open_source"

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    new-instance v0, Lpu0;

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    invoke-direct {v0, p0, v1}, Lpu0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p1, Landroidx/preference/Preference;->k:Lul0;

    .line 145
    .line 146
    :cond_7
    const-string p1, "key_localization"

    .line 147
    .line 148
    invoke-virtual {p0, p1}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_8

    .line 153
    .line 154
    new-instance v0, Lpu0;

    .line 155
    .line 156
    const/4 v1, 0x1

    .line 157
    invoke-direct {v0, p0, v1}, Lpu0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V

    .line 158
    .line 159
    .line 160
    iput-object v0, p1, Landroidx/preference/Preference;->k:Lul0;

    .line 161
    .line 162
    :cond_8
    const-string p1, "key_version"

    .line 163
    .line 164
    invoke-virtual {p0, p1}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    const-string v0, "1.9.2"

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Landroidx/preference/Preference;->v(Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    const-string p1, "key_feedback"

    .line 176
    .line 177
    invoke-virtual {p0, p1}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-eqz p1, :cond_a

    .line 182
    .line 183
    new-instance v0, Lpu0;

    .line 184
    .line 185
    const/4 v1, 0x2

    .line 186
    invoke-direct {v0, p0, v1}, Lpu0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V

    .line 187
    .line 188
    .line 189
    iput-object v0, p1, Landroidx/preference/Preference;->k:Lul0;

    .line 190
    .line 191
    :cond_a
    const-string p1, "key_privacy"

    .line 192
    .line 193
    invoke-virtual {p0, p1}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-eqz p1, :cond_b

    .line 198
    .line 199
    new-instance v0, Lpu0;

    .line 200
    .line 201
    const/4 v1, 0x3

    .line 202
    invoke-direct {v0, p0, v1}, Lpu0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V

    .line 203
    .line 204
    .line 205
    iput-object v0, p1, Landroidx/preference/Preference;->k:Lul0;

    .line 206
    .line 207
    :cond_b
    sget-object p1, Lf20;->h:Lfr;

    .line 208
    .line 209
    invoke-virtual {p0}, Liw;->G()Landroid/content/Context;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {p1, v0}, Lfr;->e(Landroid/content/Context;)Lf20;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    iput-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;->h0:Lf20;

    .line 218
    .line 219
    invoke-virtual {p0}, Liw;->F()Li5;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Lpu0;

    .line 224
    .line 225
    const/4 v2, 0x4

    .line 226
    invoke-direct {v1, p0, v2}, Lpu0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v0, v1}, Lf20;->g(Li5;Lmz;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :catchall_0
    move-exception p1

    .line 234
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    .line 239
    .line 240
    const-string v0, "This should be called after super.onCreate."

    .line 241
    .line 242
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1
.end method
