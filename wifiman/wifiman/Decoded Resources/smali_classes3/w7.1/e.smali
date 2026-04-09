.class public abstract Lw7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw7/e$a;,
        Lw7/e$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw7/e;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lu7/a;
.end method

.method public final b()Lu7/b;
    .locals 1

    new-instance v0, Lw7/f;

    invoke-direct {v0, p0}, Lw7/f;-><init>(Lw7/e;)V

    return-object v0
.end method
