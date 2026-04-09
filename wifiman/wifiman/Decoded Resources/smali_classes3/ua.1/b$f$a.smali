.class public final Lua/b$f$a;
.super Lua/b$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lua/b$f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$f$a;

    invoke-direct {v0}, Lua/b$f$a;-><init>()V

    sput-object v0, Lua/b$f$a;->b:Lua/b$f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
