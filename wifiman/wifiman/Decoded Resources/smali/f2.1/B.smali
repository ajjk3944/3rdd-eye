.class public abstract Lf2/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/B$q;,
        Lf2/B$r;,
        Lf2/B$s;,
        Lf2/B$t;,
        Lf2/B$u;,
        Lf2/B$v;
    }
.end annotation


# static fields
.field public static final c:Lf2/B$q;

.field public static final d:Lf2/B;

.field public static final e:Lf2/B;

.field public static final f:Lf2/B;

.field public static final g:Lf2/B;

.field public static final h:Lf2/B;

.field public static final i:Lf2/B;

.field public static final j:Lf2/B;

.field public static final k:Lf2/B;

.field public static final l:Lf2/B;

.field public static final m:Lf2/B;

.field public static final n:Lf2/B;

.field public static final o:Lf2/B;

.field public static final p:Lf2/B;

.field public static final q:Lf2/B;

.field public static final r:Lf2/B;

.field public static final s:Lf2/B;


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/B$q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/B$q;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/B;->c:Lf2/B$q;

    new-instance v0, Lf2/B$i;

    invoke-direct {v0}, Lf2/B$i;-><init>()V

    sput-object v0, Lf2/B;->d:Lf2/B;

    new-instance v0, Lf2/B$m;

    invoke-direct {v0}, Lf2/B$m;-><init>()V

    sput-object v0, Lf2/B;->e:Lf2/B;

    new-instance v0, Lf2/B$g;

    invoke-direct {v0}, Lf2/B$g;-><init>()V

    sput-object v0, Lf2/B;->f:Lf2/B;

    new-instance v0, Lf2/B$h;

    invoke-direct {v0}, Lf2/B$h;-><init>()V

    sput-object v0, Lf2/B;->g:Lf2/B;

    new-instance v0, Lf2/B$l;

    invoke-direct {v0}, Lf2/B$l;-><init>()V

    sput-object v0, Lf2/B;->h:Lf2/B;

    new-instance v0, Lf2/B$j;

    invoke-direct {v0}, Lf2/B$j;-><init>()V

    sput-object v0, Lf2/B;->i:Lf2/B;

    new-instance v0, Lf2/B$k;

    invoke-direct {v0}, Lf2/B$k;-><init>()V

    sput-object v0, Lf2/B;->j:Lf2/B;

    new-instance v0, Lf2/B$f;

    invoke-direct {v0}, Lf2/B$f;-><init>()V

    sput-object v0, Lf2/B;->k:Lf2/B;

    new-instance v0, Lf2/B$d;

    invoke-direct {v0}, Lf2/B$d;-><init>()V

    sput-object v0, Lf2/B;->l:Lf2/B;

    new-instance v0, Lf2/B$e;

    invoke-direct {v0}, Lf2/B$e;-><init>()V

    sput-object v0, Lf2/B;->m:Lf2/B;

    new-instance v0, Lf2/B$c;

    invoke-direct {v0}, Lf2/B$c;-><init>()V

    sput-object v0, Lf2/B;->n:Lf2/B;

    new-instance v0, Lf2/B$a;

    invoke-direct {v0}, Lf2/B$a;-><init>()V

    sput-object v0, Lf2/B;->o:Lf2/B;

    new-instance v0, Lf2/B$b;

    invoke-direct {v0}, Lf2/B$b;-><init>()V

    sput-object v0, Lf2/B;->p:Lf2/B;

    new-instance v0, Lf2/B$p;

    invoke-direct {v0}, Lf2/B$p;-><init>()V

    sput-object v0, Lf2/B;->q:Lf2/B;

    new-instance v0, Lf2/B$n;

    invoke-direct {v0}, Lf2/B$n;-><init>()V

    sput-object v0, Lf2/B;->r:Lf2/B;

    new-instance v0, Lf2/B$o;

    invoke-direct {v0}, Lf2/B$o;-><init>()V

    sput-object v0, Lf2/B;->s:Lf2/B;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf2/B;->a:Z

    const-string p1, "nav_type"

    iput-object p1, p0, Lf2/B;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lf2/B;->a:Z

    return v0
.end method

.method public final d(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lf2/B;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lf2/B;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3, p4}, Lf2/B;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lf2/B;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    return-object p3

    :cond_0
    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "There is no previous value in this bundle."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract f(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "value"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf2/B;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf2/B;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
