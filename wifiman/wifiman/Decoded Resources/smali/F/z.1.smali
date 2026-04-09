.class public abstract LF/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LF/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/z$a;

    invoke-direct {v0}, LF/z$a;-><init>()V

    sput-object v0, LF/z;->a:LF/x;

    return-void
.end method

.method public static final a()LF/x;
    .locals 1

    sget-object v0, LF/z;->a:LF/x;

    return-object v0
.end method
