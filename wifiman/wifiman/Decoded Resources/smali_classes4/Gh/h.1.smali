.class public abstract LGh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQh/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGh/h$a;
    }
.end annotation


# static fields
.field public static final b:LGh/h$a;


# instance fields
.field private final a:LZh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LGh/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGh/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGh/h;->b:LGh/h$a;

    return-void
.end method

.method private constructor <init>(LZh/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LGh/h;->a:LZh/f;

    return-void
.end method

.method public synthetic constructor <init>(LZh/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LGh/h;-><init>(LZh/f;)V

    return-void
.end method


# virtual methods
.method public getName()LZh/f;
    .locals 1

    iget-object v0, p0, LGh/h;->a:LZh/f;

    return-object v0
.end method
