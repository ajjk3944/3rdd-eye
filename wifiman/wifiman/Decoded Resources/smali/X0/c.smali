.class public abstract LX0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/c$a;
    }
.end annotation


# static fields
.field public static final a:LX0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LX0/c;->a:LX0/c$a;

    return-void
.end method
