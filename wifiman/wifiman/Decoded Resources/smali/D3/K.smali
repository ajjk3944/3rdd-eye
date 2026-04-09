.class public final LD3/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD3/y;


# instance fields
.field private a:Lf5/b;

.field private final b:Lf5/b;

.field private final c:LD3/B;


# direct methods
.method public constructor <init>(Landroid/content/Context;LD3/B;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LD3/K;->c:LD3/B;

    sget-object p2, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-static {p1}, Lc3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lc3/u;->c()Lc3/u;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc3/u;->g(Lc3/f;)La3/i;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/datatransport/cct/a;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, La3/b;->b(Ljava/lang/String;)La3/b;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LF4/t;

    new-instance v0, LD3/H;

    invoke-direct {v0, p1}, LD3/H;-><init>(La3/i;)V

    invoke-direct {p2, v0}, LF4/t;-><init>(Lf5/b;)V

    iput-object p2, p0, LD3/K;->a:Lf5/b;

    :cond_0
    new-instance p2, LF4/t;

    new-instance v0, LD3/I;

    invoke-direct {v0, p1}, LD3/I;-><init>(La3/i;)V

    invoke-direct {p2, v0}, LF4/t;-><init>(Lf5/b;)V

    iput-object p2, p0, LD3/K;->b:Lf5/b;

    return-void
.end method
