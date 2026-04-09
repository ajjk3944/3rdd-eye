.class public abstract Lcom/ui/comm/v4/a$c;
.super Lcom/ui/comm/v4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/comm/v4/a$c$a;,
        Lcom/ui/comm/v4/a$c$b;,
        Lcom/ui/comm/v4/a$c$c;,
        Lcom/ui/comm/v4/a$c$d;,
        Lcom/ui/comm/v4/a$c$e;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ui/comm/v4/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/comm/v4/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract f()Lcom/ui/comm/v4/a$d;
.end method
