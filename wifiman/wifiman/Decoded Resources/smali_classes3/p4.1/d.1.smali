.class public Lp4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp4/d$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:Lp4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lp4/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lp4/d;->a:Ljava/util/logging/Logger;

    new-instance v0, Lp4/d;

    invoke-direct {v0}, Lp4/d;-><init>()V

    sput-object v0, Lp4/d;->b:Lp4/d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lp4/d;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static e()V
    .locals 1

    sget-object v0, Lp4/d;->b:Lp4/d;

    invoke-static {v0}, Lo4/x;->n(Lo4/w;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lo4/a;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    const-class v0, Lo4/a;

    return-object v0
.end method

.method public bridge synthetic c(Lo4/v;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/d;->f(Lo4/v;)Lo4/a;

    move-result-object p1

    return-object p1
.end method

.method public f(Lo4/v;)Lo4/a;
    .locals 2

    new-instance v0, Lp4/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lp4/d$b;-><init>(Lo4/v;Lp4/d$a;)V

    return-object v0
.end method
