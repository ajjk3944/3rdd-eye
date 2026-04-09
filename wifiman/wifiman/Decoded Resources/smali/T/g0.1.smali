.class public interface abstract LT/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/g0$a;,
        LT/g0$b;
    }
.end annotation


# static fields
.field public static final a0:LT/g0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LT/g0$b;->a:LT/g0$b;

    sput-object v0, LT/g0;->a0:LT/g0$b;

    return-void
.end method


# virtual methods
.method public getKey()Ldh/i$c;
    .locals 1

    sget-object v0, LT/g0;->a0:LT/g0$b;

    return-object v0
.end method

.method public abstract j(Lmh/l;Ldh/e;)Ljava/lang/Object;
.end method
