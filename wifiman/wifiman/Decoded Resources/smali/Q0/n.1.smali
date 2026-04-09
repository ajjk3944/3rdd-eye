.class public abstract LQ0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LQ0/T;

.field private static final b:LQ0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ0/T;

    invoke-direct {v0}, LQ0/T;-><init>()V

    sput-object v0, LQ0/n;->a:LQ0/T;

    new-instance v0, LQ0/g;

    invoke-direct {v0}, LQ0/g;-><init>()V

    sput-object v0, LQ0/n;->b:LQ0/g;

    return-void
.end method

.method public static final a()LQ0/g;
    .locals 1

    sget-object v0, LQ0/n;->b:LQ0/g;

    return-object v0
.end method

.method public static final b()LQ0/T;
    .locals 1

    sget-object v0, LQ0/n;->a:LQ0/T;

    return-object v0
.end method
