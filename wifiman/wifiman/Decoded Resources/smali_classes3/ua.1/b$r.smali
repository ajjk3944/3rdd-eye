.class public abstract Lua/b$r;
.super Lua/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "r"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua/b$r$a;,
        Lua/b$r$b;,
        Lua/b$r$c;,
        Lua/b$r$d;,
        Lua/b$r$e;,
        Lua/b$r$f;,
        Lua/b$r$g;,
        Lua/b$r$h;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lua/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    const-string/jumbo v0, "UniFi"

    iput-object v0, p0, Lua/b$r;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lua/b$r;-><init>()V

    return-void
.end method
