.class public abstract LR8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/a$a;
    }
.end annotation


# static fields
.field public static final a:LR8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR8/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LR8/a;->a:LR8/a$a;

    return-void
.end method
