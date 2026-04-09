.class final LC8/b$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC8/b$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC8/b$k;

    invoke-direct {v0}, LC8/b$k;-><init>()V

    sput-object v0, LC8/b$k;->a:LC8/b$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnd/f;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    new-instance v1, Ls9/d$c;

    invoke-virtual {p1}, Lnd/f;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnd/f;

    invoke-virtual {p0, p1}, LC8/b$k;->a(Lnd/f;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
