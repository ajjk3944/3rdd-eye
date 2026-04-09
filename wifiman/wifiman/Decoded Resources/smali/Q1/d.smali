.class public abstract LQ1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ1/d$a;
    }
.end annotation


# static fields
.field public static final a:LQ1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ1/d;->a:LQ1/d$a;

    return-void
.end method
