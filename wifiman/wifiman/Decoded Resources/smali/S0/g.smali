.class public abstract LS0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LS0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LS0/c;->a()LS0/f;

    move-result-object v0

    sput-object v0, LS0/g;->a:LS0/f;

    return-void
.end method

.method public static final a()LS0/f;
    .locals 1

    sget-object v0, LS0/g;->a:LS0/f;

    return-object v0
.end method
