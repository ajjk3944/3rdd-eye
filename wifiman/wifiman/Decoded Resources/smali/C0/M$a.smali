.class final LC0/M$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC0/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC0/M$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC0/M$a;

    invoke-direct {v0}, LC0/M$a;-><init>()V

    sput-object v0, LC0/M$a;->a:LC0/M$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC0/L;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC0/M$a;->a()LC0/L;

    move-result-object v0

    return-object v0
.end method
