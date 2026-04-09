.class public final Lua/b$r$d;
.super Lua/b$r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lua/b$r$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$r$d;

    invoke-direct {v0}, Lua/b$r$d;-><init>()V

    sput-object v0, Lua/b$r$d;->b:Lua/b$r$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$r;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
