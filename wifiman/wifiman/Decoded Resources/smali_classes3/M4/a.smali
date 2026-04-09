.class public final LM4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM4/a$a;
    }
.end annotation


# static fields
.field public static final a:La5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM4/a;

    invoke-direct {v0}, LM4/a;-><init>()V

    sput-object v0, LM4/a;->a:La5/a;

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

    sget-object v0, LM4/a$a;->a:LM4/a$a;

    const-class v1, LM4/j;

    invoke-interface {p1, v1, v0}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    const-class v1, LM4/b;

    invoke-interface {p1, v1, v0}, La5/b;->a(Ljava/lang/Class;LZ4/c;)La5/b;

    return-void
.end method
