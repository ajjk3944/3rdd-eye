.class public abstract LF/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ly0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3f0

    invoke-static {v0}, Ly0/w;->a(I)Ly0/t;

    move-result-object v0

    sput-object v0, LF/p0;->a:Ly0/t;

    return-void
.end method

.method public static final a()Ly0/t;
    .locals 1

    sget-object v0, LF/p0;->a:Ly0/t;

    return-object v0
.end method
