.class public abstract LV7/b$b;
.super LV7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV7/b$b$a;,
        LV7/b$b$b;,
        LV7/b$b$c;,
        LV7/b$b$d;,
        LV7/b$b$e;,
        LV7/b$b$f;,
        LV7/b$b$g;,
        LV7/b$b$h;,
        LV7/b$b$i;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LV7/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV7/b$b;-><init>()V

    return-void
.end method
