.class public LI2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/w$b;,
        LI2/w$a;
    }
.end annotation


# static fields
.field private static final a:LI2/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI2/w;

    invoke-direct {v0}, LI2/w;-><init>()V

    sput-object v0, LI2/w;->a:LI2/w;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LI2/w;
    .locals 1

    sget-object v0, LI2/w;->a:LI2/w;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    new-instance p2, LI2/n$a;

    new-instance p3, LV2/b;

    invoke-direct {p3, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    new-instance p4, LI2/w$b;

    invoke-direct {p4, p1}, LI2/w$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
