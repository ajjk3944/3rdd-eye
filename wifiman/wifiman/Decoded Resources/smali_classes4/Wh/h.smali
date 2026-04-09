.class public final LWh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWh/h$a;
    }
.end annotation


# static fields
.field public static final b:LWh/h$a;

.field private static final c:LWh/h;


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LWh/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LWh/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LWh/h;->b:LWh/h$a;

    new-instance v0, LWh/h;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, LWh/h;-><init>(Ljava/util/List;)V

    sput-object v0, LWh/h;->c:LWh/h;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWh/h;->a:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LWh/h;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic a()LWh/h;
    .locals 1

    sget-object v0, LWh/h;->c:LWh/h;

    return-object v0
.end method
