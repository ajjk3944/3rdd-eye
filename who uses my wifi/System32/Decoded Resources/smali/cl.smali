.class public final Lcl;
.super Landroid/widget/Filter;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public b:Landroid/widget/Filterable;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcl;->a:I

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljr0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcl;->a:I

    iput-object p1, p0, Lcl;->b:Landroid/widget/Filterable;

    .line 2
    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method public convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget v0, p0, Lcl;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/widget/Filter;->convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Lcl;->b:Landroid/widget/Filterable;

    .line 12
    .line 13
    check-cast v0, Lbl;

    .line 14
    .line 15
    check-cast p1, Landroid/database/Cursor;

    .line 16
    .line 17
    check-cast v0, Lzy0;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lzy0;->c(Landroid/database/Cursor;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 6

    .line 1
    iget v0, p0, Lcl;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "charSequence"

    .line 7
    .line 8
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcl;->b:Landroid/widget/Filterable;

    .line 16
    .line 17
    check-cast v0, Ljr0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    move v1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    iget-object p1, v0, Ljr0;->i:Ljava/util/ArrayList;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    if-nez v1, :cond_5

    .line 35
    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Ljr0;->i:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "iterator(...)"

    .line 48
    .line 49
    invoke-static {v3, v4}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "next(...)"

    .line 63
    .line 64
    invoke-static {v4, v5}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    check-cast v4, Lhr0;

    .line 68
    .line 69
    iget-object v5, v4, Lhr0;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v5, p1, v2}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    iget-object v5, v4, Lhr0;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v5, p1, v2}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    :cond_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move-object p1, v1

    .line 90
    :goto_2
    iput-object p1, v0, Ljr0;->j:Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance p1, Landroid/widget/Filter$FilterResults;

    .line 93
    .line 94
    invoke-direct {p1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-object v0, v0, Ljr0;->j:Ljava/util/ArrayList;

    .line 98
    .line 99
    iput-object v0, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_5
    new-instance p1, Lrg;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :pswitch_0
    iget-object v0, p0, Lcl;->b:Landroid/widget/Filterable;

    .line 109
    .line 110
    check-cast v0, Lbl;

    .line 111
    .line 112
    check-cast v0, Lzy0;

    .line 113
    .line 114
    iget-object v1, v0, Lzy0;->p:Landroidx/appcompat/widget/SearchView;

    .line 115
    .line 116
    if-nez p1, :cond_6

    .line 117
    .line 118
    const-string p1, ""

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_3
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    const/4 v3, 0x0

    .line 130
    if-nez v2, :cond_8

    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/view/View;->getWindowVisibility()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    :try_start_0
    iget-object v1, v0, Lzy0;->q:Landroid/app/SearchableInfo;

    .line 140
    .line 141
    invoke-virtual {v0, v1, p1}, Lzy0;->j(Landroid/app/SearchableInfo;Ljava/lang/String;)Landroid/database/Cursor;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :catch_0
    :cond_8
    :goto_4
    move-object p1, v3

    .line 152
    :goto_5
    new-instance v0, Landroid/widget/Filter$FilterResults;

    .line 153
    .line 154
    invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 155
    .line 156
    .line 157
    if-eqz p1, :cond_9

    .line 158
    .line 159
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    iput v1, v0, Landroid/widget/Filter$FilterResults;->count:I

    .line 164
    .line 165
    iput-object p1, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_9
    const/4 p1, 0x0

    .line 169
    iput p1, v0, Landroid/widget/Filter$FilterResults;->count:I

    .line 170
    .line 171
    iput-object v3, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 172
    .line 173
    :goto_6
    return-object v0

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 1

    .line 1
    iget v0, p0, Lcl;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "charSequence"

    .line 7
    .line 8
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "filterResults"

    .line 12
    .line 13
    invoke-static {p2, p1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcl;->b:Landroid/widget/Filterable;

    .line 17
    .line 18
    check-cast p1, Ljr0;

    .line 19
    .line 20
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 21
    .line 22
    const-string v0, "null cannot be cast to non-null type java.util.ArrayList<com.phuongpn.whousemywifi.networkscanner.model.RouterModel>"

    .line 23
    .line 24
    invoke-static {p2, v0}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iput-object p2, p1, Ljr0;->j:Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object p1, p1, Lao0;->f:Lbo0;

    .line 32
    .line 33
    invoke-virtual {p1}, Lbo0;->b()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object p1, p0, Lcl;->b:Landroid/widget/Filterable;

    .line 38
    .line 39
    check-cast p1, Lbl;

    .line 40
    .line 41
    iget-object v0, p1, Lbl;->h:Landroid/database/Cursor;

    .line 42
    .line 43
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 44
    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    if-eq p2, v0, :cond_0

    .line 48
    .line 49
    check-cast p2, Landroid/database/Cursor;

    .line 50
    .line 51
    check-cast p1, Lzy0;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lzy0;->b(Landroid/database/Cursor;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
