.class public abstract LF/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LF/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LF/y$b;->b:LF/y$b;

    invoke-static {v0}, LF/y;->a(Lmh/l;)LF/x;

    move-result-object v0

    new-instance v1, LF/y$c;

    invoke-direct {v1, v0}, LF/y$c;-><init>(LF/x;)V

    sput-object v1, LF/y;->a:LF/x;

    return-void
.end method

.method public static final a(Lmh/l;)LF/x;
    .locals 1

    new-instance v0, LF/y$a;

    invoke-direct {v0, p0}, LF/y$a;-><init>(Lmh/l;)V

    return-object v0
.end method

.method public static final b()LF/x;
    .locals 1

    sget-object v0, LF/y;->a:LF/x;

    return-object v0
.end method
