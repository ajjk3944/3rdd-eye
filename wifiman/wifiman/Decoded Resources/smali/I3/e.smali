.class public abstract LI3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;

.field public static final b:LI3/a;

.field public static final c:LI3/c;

.field public static final d:LI3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LC3/g;->l:Lcom/google/android/gms/common/api/a;

    sput-object v0, LI3/e;->a:Lcom/google/android/gms/common/api/a;

    new-instance v0, LC3/e;

    invoke-direct {v0}, LC3/e;-><init>()V

    sput-object v0, LI3/e;->b:LI3/a;

    new-instance v0, LC3/k;

    invoke-direct {v0}, LC3/k;-><init>()V

    sput-object v0, LI3/e;->c:LI3/c;

    new-instance v0, LC3/l;

    invoke-direct {v0}, LC3/l;-><init>()V

    sput-object v0, LI3/e;->d:LI3/j;

    return-void
.end method

.method public static a(Landroid/content/Context;)LI3/b;
    .locals 1

    new-instance v0, LC3/g;

    invoke-direct {v0, p0}, LC3/g;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/app/Activity;)LI3/k;
    .locals 1

    new-instance v0, LC3/n;

    invoke-direct {v0, p0}, LC3/n;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method
