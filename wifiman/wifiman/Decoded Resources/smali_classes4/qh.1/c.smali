.class public abstract Lqh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqh/c$a;
    }
.end annotation


# static fields
.field public static final a:Lqh/c$a;

.field private static final b:Lqh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqh/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqh/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqh/c;->a:Lqh/c$a;

    sget-object v0, Lgh/b;->a:Lgh/a;

    invoke-virtual {v0}, Lgh/a;->b()Lqh/c;

    move-result-object v0

    sput-object v0, Lqh/c;->b:Lqh/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lqh/c;
    .locals 1

    sget-object v0, Lqh/c;->b:Lqh/c;

    return-object v0
.end method


# virtual methods
.method public abstract c()F
.end method

.method public abstract d()I
.end method

.method public abstract g(I)I
.end method
