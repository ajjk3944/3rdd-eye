.class final LM8/b$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$o;

    invoke-direct {v0}, LM8/b$o;-><init>()V

    sput-object v0, LM8/b$o;->a:LM8/b$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lxf/c;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance p1, Lxf/c$a;

    invoke-direct {p1, v0}, Lxf/c$a;-><init>(Ls9/d;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lxf/c$b;->a:Lxf/c$b;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LM8/b$o;->a(Ll9/a;)Lxf/c;

    move-result-object p1

    return-object p1
.end method
