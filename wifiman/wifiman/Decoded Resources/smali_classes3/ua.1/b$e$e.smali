.class public final Lua/b$e$e;
.super Lua/b$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final b:Lua/b$e$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$e$e;

    invoke-direct {v0}, Lua/b$e$e;-><init>()V

    sput-object v0, Lua/b$e$e;->b:Lua/b$e$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
