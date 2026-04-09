.class public interface abstract Lf0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/g$a;,
        Lf0/g$b;
    }
.end annotation


# static fields
.field public static final n0:Lf0/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf0/g$b;->a:Lf0/g$b;

    sput-object v0, Lf0/g;->n0:Lf0/g$b;

    return-void
.end method


# virtual methods
.method public getKey()Ldh/i$c;
    .locals 1

    sget-object v0, Lf0/g;->n0:Lf0/g$b;

    return-object v0
.end method

.method public abstract v()F
.end method
