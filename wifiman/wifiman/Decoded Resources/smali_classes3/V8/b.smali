.class public final LV8/b;
.super La9/d;
.source "SourceFile"


# instance fields
.field private final a:LG6/N;

.field private final b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private final c:Z

.field private final d:Z

.field private final e:I


# direct methods
.method public constructor <init>(LG6/N;Landroid/bluetooth/BluetoothGattCharacteristic;ZZ)V
    .locals 1

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "characteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La9/d;-><init>()V

    iput-object p1, p0, LV8/b;->a:LG6/N;

    iput-object p2, p0, LV8/b;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-boolean p3, p0, LV8/b;->c:Z

    iput-boolean p4, p0, LV8/b;->d:Z

    const/4 p3, 0x2

    invoke-virtual {p2, p3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    invoke-interface {p1}, LG6/N;->a()I

    move-result p1

    add-int/lit8 p1, p1, -0x3

    const/16 p2, 0x200

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, LV8/b;->e:I

    return-void
.end method

.method public static final synthetic c(LV8/b;I)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LV8/b;->j(I)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LV8/b;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    iget-object p0, p0, LV8/b;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p0
.end method

.method public static final synthetic e(LV8/b;)LG6/N;
    .locals 0

    iget-object p0, p0, LV8/b;->a:LG6/N;

    return-object p0
.end method

.method public static final synthetic f(LV8/b;)Z
    .locals 0

    iget-boolean p0, p0, LV8/b;->c:Z

    return p0
.end method

.method public static final synthetic g(LV8/b;)I
    .locals 0

    iget p0, p0, LV8/b;->e:I

    return p0
.end method

.method public static final synthetic h(LV8/b;)Z
    .locals 0

    iget-boolean p0, p0, LV8/b;->d:Z

    return p0
.end method

.method public static final synthetic i(LV8/b;Lmh/a;)V
    .locals 0

    invoke-direct {p0, p1}, LV8/b;->k(Lmh/a;)V

    return-void
.end method

.method private final j(I)Lgg/z;
    .locals 1

    new-instance v0, LV8/b$a;

    invoke-direct {v0, p1, p0}, LV8/b$a;-><init>(ILV8/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final k(Lmh/a;)V
    .locals 1

    sget-object v0, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LX8/a;->c(Lmh/a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected b([B)Lgg/b;
    .locals 3

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/b$e;

    invoke-direct {v0, p0}, LV8/b$e;-><init>(LV8/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LV8/b$b;

    invoke-direct {v1, p0, p1}, LV8/b$b;-><init>(LV8/b;[B)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "override fun processOutg\u2026          }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LV8/b$c;

    invoke-direct {v2, p1}, LV8/b$c;-><init>([B)V

    invoke-static {v0, v2}, Lk9/e;->e(Lgg/b;Lmh/l;)Lgg/b;

    move-result-object p1

    sget-object v0, LV8/b$d;->a:LV8/b$d;

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
