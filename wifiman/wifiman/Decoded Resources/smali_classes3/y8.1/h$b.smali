.class final Ly8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/h;-><init>(LBc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/h$b;

    invoke-direct {v0}, Ly8/h$b;-><init>()V

    sput-object v0, Ly8/h$b;->a:Ly8/h$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    check-cast p2, LBc/a$a;

    check-cast p3, LBc/a$b;

    check-cast p4, LBc/a$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Ly8/h$b;->b(LBc/a$b;LBc/a$a;LBc/a$b;LBc/a$a;)Ly8/h$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LBc/a$b;LBc/a$a;LBc/a$b;LBc/a$a;)Ly8/h$a;
    .locals 1

    const-string/jumbo v0, "sim0State"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sim0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sim1State"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sim1"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LBc/a$b$a$b$a;

    instance-of p3, p3, LBc/a$b$a$b$a;

    new-instance v0, Ly8/h$a;

    invoke-direct {v0, p1, p2, p3, p4}, Ly8/h$a;-><init>(ZLBc/a$a;ZLBc/a$a;)V

    return-object v0
.end method
