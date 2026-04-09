.class public LU2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU2/a$a;
    }
.end annotation


# static fields
.field static final a:LU2/a;

.field private static final b:LU2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU2/a;

    invoke-direct {v0}, LU2/a;-><init>()V

    sput-object v0, LU2/a;->a:LU2/a;

    new-instance v0, LU2/a$a;

    invoke-direct {v0}, LU2/a$a;-><init>()V

    sput-object v0, LU2/a;->b:LU2/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LU2/c;
    .locals 1

    sget-object v0, LU2/a;->b:LU2/c;

    return-object v0
.end method
