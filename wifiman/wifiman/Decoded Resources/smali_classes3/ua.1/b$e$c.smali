.class public final Lua/b$e$c;
.super Lua/b$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lua/b$e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$e$c;

    invoke-direct {v0}, Lua/b$e$c;-><init>()V

    sput-object v0, Lua/b$e$c;->b:Lua/b$e$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
