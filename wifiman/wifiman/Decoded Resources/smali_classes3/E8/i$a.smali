.class final LE8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/i;-><init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/i$a;

    invoke-direct {v0}, LE8/i$a;-><init>()V

    sput-object v0, LE8/i$a;->a:LE8/i$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LDc/j;->N()LS8/g;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Ls9/d$a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, LE8/i$a$a;

    invoke-direct {v3, p1}, LE8/i$a$a;-><init>(LS8/g;)V

    invoke-direct {v0, v1, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :cond_1
    new-instance p1, Lnf/f;

    invoke-direct {p1, v2, v0}, Lnf/f;-><init>(Ls9/d;Ls9/d;)V

    move-object v0, p1

    :cond_2
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LE8/i$a;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
