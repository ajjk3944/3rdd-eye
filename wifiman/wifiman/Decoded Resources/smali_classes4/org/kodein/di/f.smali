.class public interface abstract Lorg/kodein/di/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/kodein/di/f$a;,
        Lorg/kodein/di/f$b;
    }
.end annotation


# static fields
.field public static final a:Lorg/kodein/di/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/kodein/di/f$a;->a:Lorg/kodein/di/f$a;

    sput-object v0, Lorg/kodein/di/f;->a:Lorg/kodein/di/f$a;

    return-void
.end method


# virtual methods
.method public abstract getType()Lorg/kodein/type/q;
.end method

.method public abstract getValue()Ljava/lang/Object;
.end method
