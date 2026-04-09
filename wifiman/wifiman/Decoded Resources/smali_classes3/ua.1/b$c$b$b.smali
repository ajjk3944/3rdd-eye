.class public final Lua/b$c$b$b;
.super Lua/b$c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:Lua/b$c$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$c$b$b;

    invoke-direct {v0}, Lua/b$c$b$b;-><init>()V

    sput-object v0, Lua/b$c$b$b;->b:Lua/b$c$b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
