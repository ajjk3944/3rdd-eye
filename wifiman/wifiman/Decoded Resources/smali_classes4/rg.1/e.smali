.class public final Lrg/e;
.super Lgg/n;
.source "SourceFile"

# interfaces
.implements LDg/e;


# static fields
.field public static final a:Lrg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrg/e;

    invoke-direct {v0}, Lrg/e;-><init>()V

    sput-object v0, Lrg/e;->a:Lrg/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected v(Lgg/p;)V
    .locals 0

    invoke-static {p1}, Llg/c;->complete(Lgg/p;)V

    return-void
.end method
