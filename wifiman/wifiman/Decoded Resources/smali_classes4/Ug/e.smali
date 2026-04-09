.class public LUg/e;
.super Ljava/io/PrintStream;
.source "SourceFile"


# static fields
.field private static a:LUg/e; = null

.field public static b:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/io/PrintStream;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method public static a()LUg/e;
    .locals 1

    sget-object v0, LUg/e;->a:LUg/e;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-static {v0}, LUg/e;->g(Ljava/io/PrintStream;)V

    :cond_0
    sget-object v0, LUg/e;->a:LUg/e;

    return-object v0
.end method

.method public static g(Ljava/io/PrintStream;)V
    .locals 1

    new-instance v0, LUg/e;

    invoke-direct {v0, p0}, LUg/e;-><init>(Ljava/io/PrintStream;)V

    sput-object v0, LUg/e;->a:LUg/e;

    return-void
.end method

.method public static h(I)V
    .locals 0

    sput p0, LUg/e;->b:I

    return-void
.end method
