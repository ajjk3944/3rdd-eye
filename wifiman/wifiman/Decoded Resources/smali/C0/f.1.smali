.class public abstract LC0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LC0/f$a;->a:LC0/f$a;

    invoke-static {v0}, LD0/e;->a(Lmh/a;)LD0/l;

    move-result-object v0

    sput-object v0, LC0/f;->a:LD0/l;

    return-void
.end method

.method public static final a()LD0/l;
    .locals 1

    sget-object v0, LC0/f;->a:LD0/l;

    return-object v0
.end method
