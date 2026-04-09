.class public final Lcom/ui/sso/api/UiAccountApi$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/UiAccountApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/UiAccountApi$d$a;
    }
.end annotation


# instance fields
.field private a:Lcom/ui/sso/api/UiAccountApi$d$a;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/Set;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/Set;

.field private f:Lcom/ui/sso/api/UiAccountApi$c;

.field private g:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->b:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->c:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->d:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->e:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->d:Ljava/util/Set;

    return-object v0
.end method

.method public final c()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->e:Ljava/util/Set;

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$d;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final e(Lcom/ui/sso/api/UiAccountApi$d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/UiAccountApi$d;->a:Lcom/ui/sso/api/UiAccountApi$d$a;

    return-void
.end method

.method public final f(Lcom/ui/sso/api/UiAccountApi$c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/UiAccountApi$d;->f:Lcom/ui/sso/api/UiAccountApi$c;

    return-void
.end method

.method public final g(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/UiAccountApi$d;->g:Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/ui/sso/api/UiAccountApi$d;->f:Lcom/ui/sso/api/UiAccountApi$c;

    iget-object v2, v0, Lcom/ui/sso/api/UiAccountApi$d;->g:Ljava/lang/Integer;

    iget-object v3, v0, Lcom/ui/sso/api/UiAccountApi$d;->a:Lcom/ui/sso/api/UiAccountApi$d$a;

    iget-object v4, v0, Lcom/ui/sso/api/UiAccountApi$d;->b:Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const-string v6, "\n\t"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/ui/sso/api/UiAccountApi$d;->e:Ljava/util/Set;

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    const/16 v13, 0x3e

    const/4 v14, 0x0

    const-string v7, "\n\t"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcom/ui/sso/api/UiAccountApi$d;->e:Ljava/util/Set;

    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    const/16 v14, 0x3e

    const/4 v15, 0x0

    const-string v8, "\'\n\t"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcom/ui/sso/api/UiAccountApi$d;->c:Ljava/util/Set;

    move-object v8, v7

    check-cast v8, Ljava/lang/Iterable;

    const/16 v15, 0x3e

    const/16 v16, 0x0

    const-string v9, "\n\t"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcom/ui/sso/api/UiAccountApi$d;->d:Ljava/util/Set;

    move-object v9, v8

    check-cast v9, Ljava/lang/Iterable;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const-string v10, "\n\t"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Account API Support File { \nFINAL API:\n\t"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nRETRY COUNT: "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nDirect API:\n\t"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nCNT PROVIDER API:\n\t"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nCNT Provider authorities with an API: \n\t"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nCNT Provider packages: \n\t"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nCNT Provider authorities: \n\t "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n}"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
