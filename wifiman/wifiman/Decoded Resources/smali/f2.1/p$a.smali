.class public final Lf2/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/p$a$a;
    }
.end annotation


# static fields
.field public static final d:Lf2/p$a$a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/p$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/p$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/p$a;->d:Lf2/p$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lf2/p;
    .locals 4

    new-instance v0, Lf2/p;

    iget-object v1, p0, Lf2/p$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lf2/p$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lf2/p$a;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lf2/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lf2/p$a;
    .locals 1

    const-string v0, "uriPattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/p$a;->a:Ljava/lang/String;

    return-object p0
.end method
