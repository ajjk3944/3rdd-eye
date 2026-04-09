.class public final Lua/b$e$a$b;
.super Lua/b$e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:Lua/b$e$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/b$e$a$b;

    invoke-direct {v0}, Lua/b$e$a$b;-><init>()V

    sput-object v0, Lua/b$e$a$b;->b:Lua/b$e$a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lua/b$e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
