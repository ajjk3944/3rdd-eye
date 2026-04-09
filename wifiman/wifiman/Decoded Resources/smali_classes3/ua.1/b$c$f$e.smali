.class public final Lua/b$c$f$e;
.super Lua/b$c$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$c$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final b:Lua/b$c$f$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$c$f$e;

    invoke-direct {v0}, Lua/b$c$f$e;-><init>()V

    sput-object v0, Lua/b$c$f$e;->b:Lua/b$c$f$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$c$f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
