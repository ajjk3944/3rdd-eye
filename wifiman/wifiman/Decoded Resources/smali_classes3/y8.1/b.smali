.class public final Ly8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/b$a;
    }
.end annotation


# static fields
.field public static final d:Ly8/b$a;

.field public static final e:I


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly8/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ly8/b;->d:Ly8/b$a;

    const/16 v0, 0x8

    sput v0, Ly8/b;->e:I

    return-void
.end method

.method public constructor <init>(Lhd/a$c;LCc/n;Lnd/g;)V
    .locals 2

    const-string/jumbo v0, "roamingService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "placesManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lhd/a$c;->a()Lgg/i;

    move-result-object p1

    invoke-interface {p2}, LCc/n;->a()Lgg/i;

    move-result-object p2

    sget-object v0, Ly8/b$d;->a:Ly8/b$d;

    invoke-static {p1, p2, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/b;->a:Lgg/i;

    invoke-interface {p3}, Lnd/g;->h()Lgg/i;

    move-result-object p3

    sget-object v1, Ly8/b$c;->a:Ly8/b$c;

    invoke-virtual {p3, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Ly8/b;->b:Lgg/i;

    sget-object v1, Ly8/b$b;->a:Ly8/b$b;

    invoke-static {p3, p1, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/b;->c:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/b;->c:Lgg/i;

    return-object v0
.end method
