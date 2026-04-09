.class public final Lua/b$k$a;
.super Lua/b$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lua/b$k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$k$a;

    invoke-direct {v0}, Lua/b$k$a;-><init>()V

    sput-object v0, Lua/b$k$a;->b:Lua/b$k$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
