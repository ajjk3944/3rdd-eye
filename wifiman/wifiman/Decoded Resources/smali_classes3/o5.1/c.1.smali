.class public final Lo5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/c$e;,
        Lo5/c$f;,
        Lo5/c$c;,
        Lo5/c$b;,
        Lo5/c$a;,
        Lo5/c$d;
    }
.end annotation


# static fields
.field public static final a:La5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/c;

    invoke-direct {v0}, Lo5/c;-><init>()V

    sput-object v0, Lo5/c;->a:La5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La5/b;)V
    .locals 2

    const-class v0, Lo5/z;

    sget-object v1, Lo5/c$e;->a:Lo5/c$e;

    invoke-interface {p1, v0, v1}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    const-class v0, Lo5/C;

    sget-object v1, Lo5/c$f;->a:Lo5/c$f;

    invoke-interface {p1, v0, v1}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    const-class v0, Lo5/e;

    sget-object v1, Lo5/c$c;->a:Lo5/c$c;

    invoke-interface {p1, v0, v1}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    const-class v0, Lo5/b;

    sget-object v1, Lo5/c$b;->a:Lo5/c$b;

    invoke-interface {p1, v0, v1}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    const-class v0, Lo5/a;

    sget-object v1, Lo5/c$a;->a:Lo5/c$a;

    invoke-interface {p1, v0, v1}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    const-class v0, Lo5/u;

    sget-object v1, Lo5/c$d;->a:Lo5/c$d;

    invoke-interface {p1, v0, v1}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    return-void
.end method
