.class final Lrc/h$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrc/h$g;->a(LMb/c;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrc/h;


# direct methods
.method constructor <init>(Lrc/h;)V
    .locals 0

    iput-object p1, p0, Lrc/h$g$a;->a:Lrc/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lrc/h$g$a;->e()V

    return-void
.end method

.method public static synthetic b(LMb/c;)LMb/c;
    .locals 0

    invoke-static {p0}, Lrc/h$g$a;->d(LMb/c;)LMb/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LMb/c;)LMb/c;
    .locals 8

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LMb/c;->b(LMb/c;IILjava/lang/Long;ZILjava/lang/Object;)LMb/c;

    move-result-object p0

    return-object p0
.end method

.method private static final e()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "App review marked as shown"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj4/a;

    invoke-virtual {p0, p1}, Lrc/h$g$a;->c(Lj4/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lj4/a;)Lgg/f;
    .locals 4

    const-string v0, "reviewInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrc/h$g$a;->a:Lrc/h;

    invoke-static {v0}, Lrc/h;->j(Lrc/h;)Lrc/h$a;

    move-result-object v0

    new-instance v1, Lrc/j;

    invoke-direct {v1}, Lrc/j;-><init>()V

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->a(Lmh/l;)Lgg/b;

    move-result-object v0

    new-instance v1, Lrc/k;

    invoke-direct {v1}, Lrc/k;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lrc/h$g$a;->a:Lrc/h;

    invoke-static {v1}, Lrc/h;->k(Lrc/h;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1, v2, p1}, Lrc/h;->m(Lrc/h;Landroid/app/Activity;Lj4/a;)Lgg/b;

    move-result-object p1

    iget-object v1, p0, Lrc/h$g$a;->a:Lrc/h;

    new-instance v2, Lrc/h$g$a$a;

    invoke-direct {v2, v1}, Lrc/h$g$a$a;-><init>(Lrc/h;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    const/4 p1, 0x2

    aput-object v1, v2, p1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no activity is registered"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
