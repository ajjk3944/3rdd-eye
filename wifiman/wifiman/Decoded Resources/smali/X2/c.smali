.class public abstract LX2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/c$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LX2/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/c;-><init>()V

    return-void
.end method

.method public static a()LX2/c;
    .locals 1

    new-instance v0, LX2/c$b;

    invoke-direct {v0}, LX2/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method abstract b(Z)V
.end method

.method public abstract c()V
.end method
